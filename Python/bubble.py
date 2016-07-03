#!/usr/bin/python2.7
# logs execution time
import time
import csv
start_time = time.time()
# bubble sort tutorial : https://www.youtube.com/watch?v=HhX_jlBkTD0
# http://danishmujeeb.com/blog/2014/01/basic-sorting-algorithms-implemented-in-python


counter = 0
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
#length = len(myList)
######


def bubble_sort(items2sort):
	#loop list lenth
	for i in range(len(items2sort)):
		#itterate elke item in de list
		for j in range(len(items2sort)-1-i):#-i om het sneller te maken ?
			# als item(j) groter is dan de volgende (j+1)
			if items2sort[j] > items2sort [j+1]:
				#verwissel ze
				items2sort[j], items2sort[j+1] = items2sort [j+1], items2sort[j]
				#print myList # print elke stap voor visual feedback
				#counter++


print 'unsorted list : '
print myList
print '------------- '
bubble_sort(myList)
print 'sorted list'
print myList
print("----- %s seconds -----" % (time.time() - start_time))
#print counter