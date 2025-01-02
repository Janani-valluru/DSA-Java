# Write your MySQL query statement below

-- SELECT w.NAME , w.POPULATION , w.area
-- FROM WORLD as w
-- WHERE W.area >= 3000000

SELECT
    name, population, area
FROM
    world
WHERE
    area >= 3000000 OR population >= 25000000
;