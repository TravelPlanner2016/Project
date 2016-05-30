SELECT price_a_day  FROM auto;
SELECT price_a_day FROM room;

SELECT sum1, sum2
    FROM (SELECT SUM(price_a_day) AS sum1 FROM auto) AS tsum1
    ,    (SELECT SUM(price_a_day) AS sum2 FROM room) AS tsum2;
INSERT INTO reserve (summary_bill) VALUES(15,tsum1+tsum2);