#!/usr/bin/python2.7
import csv

txtFile = []
def readsmall():
	text_file = open ("small.txt", "r")
	for row in csv.reader(text_file):
 		print(row)
		for i in range(len(row)):
  			txtFile.append(int(i))
print 'reading done'
