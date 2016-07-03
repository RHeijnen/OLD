<?php $queries = array(



 



   'SELECT DISTINCT unitid, count(unitid) from events where value = true group by unitid'
	=> 'contruecount',

   'SELECT DISTINCT unitid, count(unitid) from events group by unitid;'
	=> 'connectioncount',

   'SELECT DISTINCT unitid FROM events'
	=> 'unitid',
			'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14100071
			AND positions.unitid = 14100071;'
	=> '14100071',
			'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14120026
			AND positions.unitid = 14120026;'
	=> '14120026',
				'SELECT *
			FROM events
			INNER JOIN positions
			ON events.datetime=positions.datetime
			AND events.unitid = 14120031
			AND positions.unitid = 14120031;'
	=> '14120031',
				'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14120029
			AND positions.unitid = 14120029;'
	=> '14120029',
				'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 15030001
			AND positions.unitid = 15030001;'
	=> '15030001',
				'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14100042
			AND positions.unitid = 14100042;'
	=> '14100042',
				'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 999
			AND positions.unitid = 999;'
	=> '999',
				'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14120032
			AND positions.unitid = 14120032;'
	=> '14120032',
					'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14120064
			AND positions.unitid = 14120064;'
	=> '14100064',
					'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 14100015
			AND positions.unitid = 14100015;'
	=> '14100015',
					'SELECT *
			FROM events
			INNER JOIN positions
			ON events.tim=positions.tim
			AND events.unitid = 15030000
			AND positions.unitid = 15030000;'
	=> '15030000',
	
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14100071
AND positions.unitid = 14100071
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14100071status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14120026
AND positions.unitid = 14120026
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14120026status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14120031
AND positions.unitid = 14120031
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14120031status',

					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14120029
AND positions.unitid = 14120029
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14120029status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 15030001
AND positions.unitid = 15030001
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '15030001status',

					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14100042
AND positions.unitid = 14100042
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14100042status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 999
AND positions.unitid = 999
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '999status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14120032
AND positions.unitid = 14120032
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14120032status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14100064
AND positions.unitid = 14100064
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14100064status',
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 14100015
AND positions.unitid = 14100015
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '14100015status',	
					'SELECT *
FROM events
INNER JOIN positions
ON events.tim=positions.tim
AND events.unitid = 15030000
AND positions.unitid = 15030000
AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone
ORDER BY events.tim DESC
limit 1'
	=> '15030000status',
'SELECT COUNT(numsatalites)
FROM positions
WHERE numsatalites = 0'
	=> 'piechartBlack',
	

	);
