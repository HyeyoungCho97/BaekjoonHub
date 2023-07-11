-- 코드를 입력하세요
SELECT  animal_id, name
FROM    (SELECT  o.animal_id, o.name
         FROM    animal_outs o Join animal_ins i
            ON  o.animal_id = i.animal_id
         ORDER BY o.datetime-i.datetime DESC)
WHERE   ROWNUM<=2