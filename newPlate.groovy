import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere 
CSG Cube= new Cube(12*25.6,// X dimention
			12*25.6,// Y dimention
			6.35//  Z dimention
			).toCSG().movez(30)

CSG shape = new Cylinder(10*25.4/2,50.00,(int)100).toCSG()
CSG frame= Cube.difference(shape)

			return [frame]