import bpy
import sys
import mathutils
import io_import_scene_ifc
import io_mesh_threejs.export_threejs
import os
import datetime

class flushfile:
    def __init__(self, f):
        self.f = f
    def write(self, x):
        self.f.write(x)
        self.f.flush()
sys.stdout = flushfile(sys.stdout)

argv = sys.argv
argv = argv[argv.index("--") + 1:]  # get all args after "--"
 
ifc_in = argv[0]
file_out = argv[1]

print(str(datetime.datetime.now())+" IMPORT")
io_import_scene_ifc.import_ifc(ifc_in,False,True)
print(str(datetime.datetime.now())+" RENAME")
for ob in [o for o in bpy.data.objects if o.type == 'MESH']:
	ob.data.name = ob.name
print(str(datetime.datetime.now())+" SAVEASBLEND")
blend_file_out = os.path.splitext(file_out)[0]+ ".blend"
bpy.ops.wm.save_as_mainfile(filepath=blend_file_out,check_existing=False)
print(str(datetime.datetime.now())+" EXPORT")
obj_file_out = os.path.splitext(file_out)[0]+ ".obj"
json_file_out = os.path.splitext(file_out)[0]+ ".js"
if obj_file_out == file_out:
	bpy.ops.export_scene.obj(filepath=obj_file_out, axis_forward='-Z', axis_up='Y', group_by_material = True)
else:
	if json_file_out == file_out:
		io_mesh_threejs.export_threejs.save(None, bpy.context, filepath=json_file_out,  option_export_scene=True,  option_flip_yz=False, option_materials=False, option_normals=False)
		# in order to use the io_three, comment the line one above and uncomment the following lines: 
		#from io_three import constants		
		#from io_three import exporter
		#constants.EXPORT_OPTIONS[constants.LOGGING] = constants.WARNING
		#exporter.export_scene(json_file_out,  constants.EXPORT_OPTIONS )
	else:
		bpy.ops.wm.collada_export(filepath=file_out)
print(str(datetime.datetime.now())+" FINISHED")