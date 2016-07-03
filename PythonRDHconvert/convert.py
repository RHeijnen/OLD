convertlist = [107035.288471878,479440.269438375]

class Conversion:
	
	def fromRdToWgs(n, coords ):
		X0      = 155000
		Y0      = 463000
		phi0    = 52.15517440
		lam0    = 5.38720621
		
		Kp = [0,2,0,2,0,2,1,4,2,4,1]
		Kq = [1,0,2,1,3,2,0,0,3,1,1]
		Kpq = [3235.65389,-32.58297,-0.24750,-0.84978,-0.06550,-0.01709,-0.00738,0.00530,-0.00039,0.00033,-0.00012]

		Lp = [1,1,1,3,1,3,0,3,1,0,2,5]
		Lq = [0,1,2,0,3,1,1,2,4,2,0,0]
		Lpq = [5260.52916,105.94684,2.45656,-0.81885,0.05594,-0.05607,0.01199,-0.00256,0.00128,0.00022,-0.00022,0.00026]

		dX = 1E-5 * ( coords[0] -X0 )
		dY = 1E-5 * ( coords[1] -Y0 )
					
		phi = 0
		lam = 0

		for k in range(len(Kpq)):
			phi = phi + ( Kpq[k] * dX**Kp[k] * dY**Kq[k] )
			phi = phi0 + phi / 3600

		for l in range(len(Lpq)):
			lam = lam + ( Lpq[l] * dX**Lp[l] * dY**Lq[l] )
			lam = lam0 + lam / 3600
		#print 'new co-ords:' + str(phi) + " " + str(lam)
		return [phi,lam]

	#print 'original co-ords: 107035.288471878, 479440.269438375 '	
	#print '****************'							
	#fromRdToWgs(convertlist)
