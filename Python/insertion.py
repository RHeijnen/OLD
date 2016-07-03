#!/usr/bin/python2.7
import csv
#import filerdr
# logs execution time
import time
start_time = time.time()
# bubble sort tutorial : https://www.youtube.com/watch?v=HhX_jlBkTD0
# http://danishmujeeb.com/blog/2014/01/basic-sorting-algorithms-implemented-in-python

myList = []
######################
#Csv 
text_file = open ("large.txt", "r")
lines = text_file.read().split(',')
for i in (lines):
	  	myList.append(int(i))
		#print i
#print lines
#print len(lines)
##################
#Static
#myList=[5,2,3,1,7,4,6,9,8,15,11,10,12,14,13]
#
######
#length = len(myList)


def insertion_sort(items2sort):
	#loop list length
	for i in range(1, len(items2sort)):
		j =  i
		while j > 0 and items2sort[j] < items2sort[j-1]:
			#switcheroo
			items2sort[j],items2sort[j-1] = items2sort[j-1],items2sort[j]
			j -=1
			#print myList


print ' unsorted : '
print myList
print '-------------------------'
insertion_sort(myList)
print ' sorted : '
print myList
print("----- %s seconds -----" % (time.time() - start_time))
