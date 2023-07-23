-- 코드를 입력하세요
SELECT  member_id, member_name, gender, DATE_FORMAT(date_of_birth, '%Y-%m-%d')
FROM    member_profile
WHERE   date_of_birth LIKE '%-03-%'
    AND gender LIKE 'W'
    AND tlno IS NOT NULL
ORDER BY member_id