SELECT d.product_id,
       IFNULL(ROUND(SUM(d.average_price) / SUM(d.units), 2), 0) AS average_price
FROM (
    SELECT f.product_id,
           (f.units * f.price) AS average_price,
           f.units
    FROM (
        SELECT p.product_id, u.units, p.price
        FROM Prices AS p
        LEFT JOIN UnitsSold AS u
          ON p.product_id = u.product_id
         AND u.purchase_date BETWEEN p.start_date AND p.end_date
    ) AS f
) AS d
GROUP BY d.product_id;
