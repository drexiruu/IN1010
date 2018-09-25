/* Oppgave 2 */

-- a
select * from timelistelinje where timelistenr = 3;
-- b
select count(*) as antall_timelister from timeliste;
-- c
select count(*) as antall_ikke_utbetalt from timeliste where status = 'utbetalt';
-- d
select status, count(*) as antall from timeliste group by status;
-- e
select count(*) as antall, count(pause) as antall_med_pause from timelistelinje;
-- f
select count(*) as antall_uten_pause from timelistelinje where pause is null;


/* Oppgave 3 */

-- a
select sum(ta.timeantall)
from timeantall ta natural join timeliste t
where t.status != 'utbetalt';
--b
select distinct t.timelistenr, t.beskrivelse
from timeliste t join timelistelinje tl on t.timelistenr = tl.timelistenr
where lower(tl.beskrivelse) like '%test';
--c
select v.timelistenr, v.linjenr, v.varighet, tl.beskrivelse
from varighet v join timelistelinje tl on v.timelistenr = tl.timelistenr and
  v.linjenr = tl.linjenr
order by v.varighet desc
limit 5;
-- d
select t.timelistenr, count(tl.timelistenr)
from timeliste t left join timelistelinje tl on t.timelistenr = tl.timelistenr
group by t.timelistenr
order by t.timelistenr;
-- e
select sum(ta.timeantall) as antall_timer, sum(ta.timeantall)*200 as utbetalt_penger
from timeliste t join timeantall ta on t.timelistenr = ta.timelistenr
where t.status = 'utbetalt';
-- f
select t.timelistenr, count(tl.timelistenr)
from timeliste t join timelistelinje tl on t.timelistenr = tl.timelistenr
where tl.pause is null
group by t.timelistenr
having count(tl.timelistenr) >= 4
order by t.timelistenr;
