#!/usr/bin/python

import sys
import io

def replace_line(file_name, line_num):
    text ="\n"+"'SELECT * FROM events INNER JOIN positions ON events.tim=positions.tim AND events.unitid ="+str(sys.argv[1])+" AND positions.unitid ="+str(sys.argv[1])+"' => '"+str(sys.argv[1])+"'," + "\n" +"'SELECT * FROM events INNER JOIN positions ON events.tim = positions.tim AND events.unitid ="+str(sys.argv[1])+" AND positions.unitid = "+str(sys.argv[1])+" AND events.tim::time without time zone < CURRENT_TIMESTAMP::time without time zone ORDER BY events.tim DESC limit 1' => '"+str(sys.argv[1])+"status'," + "\n"
    lines = open(file_name, 'r').readlines()
    lines[line_num] = text
    out = open(file_name, 'w')
    out.writelines(lines)
    out.close()
    print str(text)
	
#real first argument is script name (user.py)
print 'first argument:', str(sys.argv[1])#so get 1 not 0

replace_line('queries.php', 2)





