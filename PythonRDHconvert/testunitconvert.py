import unittest
from convert import Conversion
import logging
import sys

class TestConversion(unittest.TestCase):
	testconvertion = list()
	def setUp(self):
		print('In setUp()')
		convertlist = [107035.288471878,479440.269438375]
		cnvt = Conversion()
		testconvertion = cnvt.fromRdToWgs(convertlist)

	def test(self):
		print('in test()')
		RDHcoords = [107035.288471878,479440.269438375]
		cnvt = Conversion()
		testconvertion = cnvt.fromRdToWgs(RDHcoords)
		ConvertedCoords = [52.169665976510366,5.3887030701270335]
		self.assertEqual(ConvertedCoords, testconvertion)



if __name__ == '__main__':
	log_file = 'log_file.txt'
	f = open(log_file, "w")
	runner = unittest.TextTestRunner(f)
	unittest.main(testRunner=runner)
	unittest.main()
	f.close()