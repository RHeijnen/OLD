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


def merge_sort(items2sort):
	if len(items2sort) > 1 :

		mid = len(items2sort) /2 # midde van list length bijv. 10 van de 20
		left = items2sort[0:mid] # 0 tot mid / 10 bijv
		right = items2sort[mid:] # mid / 10 tot einde

		merge_sort(left) # merge/sorteer left
		merge_sort(right) # merge/sorteer right
	
		l = 0
		r = 0
		for i in range(len(items2sort)): # merge the left and right list parts
	
			Lpart = left[l] if l < len(left) else None  #
			Rpart = right[r] if r < len(right) else None #

			if (Lpart and Rpart and Lpart < Rpart) or Rpart is None:
				items2sort[i] = Lpart
				l += 1
			elif (Lpart and Rpart and Lpart >= Rpart) or Lpart is None:
				items2sort[i] = Rpart
				r += 1
			else:
				raise Exception('Merge Error')

print ' unsorted : '
print myList
print '-------------------------'
merge_sort(myList)
print ' sorted : '
print myList
print("----- %s seconds -----" % (time.time() - start_time))
