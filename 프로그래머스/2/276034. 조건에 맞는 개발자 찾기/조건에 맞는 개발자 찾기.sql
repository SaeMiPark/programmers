select ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPERS d
where exists(
    select 1
    from SKILLCODES s
    where (d.SKILL_CODE & s.CODE) != 0
    and s.name in ('Python', 'C#')
)
order by id;