'''# +---------------------------------------------------------+
# | Copyright (c) 2005-2010 Anthony D'Agostino              |
# | http://home.comcast.net/~chronosphere                   |
# | scorpius@netzero.com                                    |
# | February 12, 2005                                       |
# | Newell Teapot Generator                                 |
# | Adds the famous missing primitive to Blender            |
# +---------------------------------------------------------+

# ***** BEGIN GPL LICENSE BLOCK *****
#
# This program is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License
# as published by the Free Software Foundation; either version 2
# of the License, or (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software Foundation,
# Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
#
# ***** END GPL LICENCE BLOCK *****

bl_info = {
    "name": "Teapot+",
    "author": "Anthony D'Agostino",
    "version": (1, 0),
    "blender": (2, 57, 0),
    "location": "View3D > Add > Mesh ",
    "url": "http://wiki.blender.org/index.php/Extensions:2.5/Py/Scripts/Add_Teapot",
    "category": "Add Mesh"}
'''
import bpy, mathutils, io, operator, functools

class AddTeapot(bpy.types.Operator):
	"""Add a teapot mesh"""
	bl_idname = "mesh.primitive_teapot_add"
	bl_label = "Add Teapot"
	bl_options = {"REGISTER", "UNDO"}

	resolution = bpy.props.IntProperty(name="Resolution",
		description="Resolution of the Teapot",
		default=5, min=2, max=15)

	objecttype = bpy.props.IntProperty(name="Object Type",
		description="Type of Bezier Object",
		default=1, min=1, max=2)

	def execute(self, context):
		verts, faces = make_teapot(self.objecttype,
								   self.resolution)
		# Actually create the mesh object from this geometry data.
		obj = create_mesh_object(context, verts, [], faces, "Teapot")
		return {'FINISHED'}

def menu_func(self, context):
	self.layout.operator(AddTeapot.bl_idname, text="Teapot+", icon="MESH_CUBE")

def register():
	bpy.utils.register_module(__name__)
	bpy.types.INFO_MT_mesh_add.append(menu_func)

def unregister():
	bpy.utils.unregister_module(__name__)
	bpy.types.INFO_MT_mesh_add.remove(menu_func)

if __name__ == "__main__":
	register()

def create_mesh_object(context, verts, edges, faces, name):
    # Create new mesh
    mesh = bpy.data.meshes.new(name)
    # Make a mesh from a list of verts/edges/faces.
    mesh.from_pydata(verts, edges, faces)
    # Update mesh geometry after adding stuff.
    mesh.update()
    from bpy_extras import object_utils
    return object_utils.object_data_add(context, mesh, operator=None)

# ==========================
# === Bezier patch Block ===
# ==========================
def read_indexed_patch_file(filename):
	file = io.StringIO(filename)
	rawpatches = []
	patches = []
	numpatches = int(file.readline())
	for i in range(numpatches):
		line = file.readline()
		a,b,c,d, e,f,g,h, i,j,k,l, m,n,o,p = map(int, line.split(","))
		patches.append([[a,b,c,d], [e,f,g,h], [i,j,k,l], [m,n,o,p]])
		rawpatches.append([[0,0,0,0], [0,0,0,0], [0,0,0,0], [0,0,0,0]])
	verts = []
	numverts = int(file.readline())
	for i in range(numverts):
		line = file.readline()
		v1,v2,v3 = map(float, line.split(","))
		verts.append((v1,v2,v3))
	for i in range(len(patches)):
		for j in range(4):	#len(patches[i])):
			for k in range(4):	#len(patches[i][j])):
				index = patches[i][j][k] - 1
				rawpatches[i][j][k] = verts[index]
	return rawpatches

def patches_to_raw(patches, resolution):
	raw = []
	for patch in patches:
		verts = make_verts(patch, resolution)
		faces = make_faces(resolution)
		rawquads = indexed_to_rawquads(verts, faces)
		raw.append(rawquads)
	raw = functools.reduce(operator.add, raw)  # flatten the list
	return raw

def make_bezier(ctrlpnts, resolution):
	b1 = lambda t: t*t*t
	b2 = lambda t: 3*t * t * (1-t)
	b3 = lambda t: 3*t * (1-t) * (1-t)
	b4 = lambda t: (1-t) * (1-t) * (1-t)
	makevec = lambda v: mathutils.Vector(v)
	p1,p2,p3,p4 = map(makevec, ctrlpnts)
	curveverts = []
	for i in range(resolution+1):
		t = i/resolution
		x,y,z = b1(t)*p1 + b2(t)*p2 + b3(t)*p3 + b4(t)*p4
		curveverts.append((x,y,z))
	return curveverts

def make_bezier(ctrlpnts, resolution):
	b1 = lambda t: t*t*t
	b2 = lambda t: 3*t * t * (1-t)
	b3 = lambda t: 3*t * (1-t) * (1-t)
	b4 = lambda t: (1-t) * (1-t) * (1-t)
	p1,p2,p3,p4 = map(mathutils.Vector, ctrlpnts)
	def makevert(t):
		x,y,z = b1(t)*p1 + b2(t)*p2 + b3(t)*p3 + b4(t)*p4
		return (x,y,z)
	curveverts = [makevert(i/resolution) for i in range(resolution+1)]
	return curveverts

def make_verts(a, resolution):
	s = []
	for i in a:
		c = make_bezier(i, resolution)
		s.append(c)
	b = transpose(s)
	s = []
	for i in b:
		c = make_bezier(i, resolution)
		s.append(c)
	verts = s
	verts = functools.reduce(operator.add, verts)  # flatten the list
	return verts

def make_faces(resolution):
	n = resolution+1
	faces = []
	for i in range(n-1):
		for j in range(n-1):
			v1 = (i+1)*n+j
			v2 = (i+1)*n+j+1
			v3 = i*n+j+1
			v4 = i*n+j
			faces.append([v1,v2,v3,v4])
	return faces

def indexed_to_rawquads(verts, faces):
	rows = len(faces)
	cols = len(faces[0])	# or 4
	rawquads = [[None]*cols for i in range(rows)]
	for i in range(rows):
		for j in range(cols):
			index = faces[i][j]
			rawquads[i][j] = verts[index]
	return rawquads

def raw_to_indexed(rawfaces): # Generate verts and faces lists, without dups
	verts = []
	coords = {}
	index = 0
	for i in range(len(rawfaces)):
		for j in range(len(rawfaces[i])):
			vertex = rawfaces[i][j]
			if vertex not in coords:
				coords[vertex] = index
				index += 1
				verts.append(vertex)
			rawfaces[i][j] = coords[vertex]
	return verts, rawfaces

def transpose(rowsbycols):
	rows = len(rowsbycols)
	cols = len(rowsbycols[0])
	colsbyrows = [[None]*rows for i in range(cols)]
	for i in range(cols):
		for j in range(rows):
			colsbyrows[i][j] = rowsbycols[j][i]
	return colsbyrows

def make_teapot(filename, resolution):
	filenames = [None, teapot, teaspoon]
	filename = filenames[filename]
	patches = read_indexed_patch_file(filename)
	raw = patches_to_raw(patches, resolution)
	verts, faces = raw_to_indexed(raw)
	return (verts, faces)

# =================================
# === Indexed Bezier Data Block ===
# =================================
teapot="""32
1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
4,17,18,19,8,20,21,22,12,23,24,25,16,26,27,28
19,29,30,31,22,32,33,34,25,35,36,37,28,38,39,40
31,41,42,1,34,43,44,5,37,45,46,9,40,47,48,13
13,14,15,16,49,50,51,52,53,54,55,56,57,58,59,60
16,26,27,28,52,61,62,63,56,64,65,66,60,67,68,69
28,38,39,40,63,70,71,72,66,73,74,75,69,76,77,78
40,47,48,13,72,79,80,49,75,81,82,53,78,83,84,57
57,58,59,60,85,86,87,88,89,90,91,92,93,94,95,96
60,67,68,69,88,97,98,99,92,100,101,102,96,103,104,105
69,76,77,78,99,106,107,108,102,109,110,111,105,112,113,114
78,83,84,57,108,115,116,85,111,117,118,89,114,119,120,93
121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136
124,137,138,121,128,139,140,125,132,141,142,129,136,143,144,133
133,134,135,136,145,146,147,148,149,150,151,152,69,153,154,155
136,143,144,133,148,156,157,145,152,158,159,149,155,160,161,69
162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177
165,178,179,162,169,180,181,166,173,182,183,170,177,184,185,174
174,175,176,177,186,187,188,189,190,191,192,193,194,195,196,197
177,184,185,174,189,198,199,186,193,200,201,190,197,202,203,194
204,204,204,204,207,208,209,210,211,211,211,211,212,213,214,215
204,204,204,204,210,217,218,219,211,211,211,211,215,220,221,222
204,204,204,204,219,224,225,226,211,211,211,211,222,227,228,229
204,204,204,204,226,230,231,207,211,211,211,211,229,232,233,212
212,213,214,215,234,235,236,237,238,239,240,241,242,243,244,245
215,220,221,222,237,246,247,248,241,249,250,251,245,252,253,254
222,227,228,229,248,255,256,257,251,258,259,260,254,261,262,263
229,232,233,212,257,264,265,234,260,266,267,238,263,268,269,242
270,270,270,270,279,280,281,282,275,276,277,278,271,272,273,274
270,270,270,270,282,289,290,291,278,286,287,288,274,283,284,285
270,270,270,270,291,298,299,300,288,295,296,297,285,292,293,294
270,270,270,270,300,305,306,279,297,303,304,275,294,301,302,271
306
1.4,0.0,2.4
1.4,-0.784,2.4
0.784,-1.4,2.4
0.0,-1.4,2.4
1.3375,0.0,2.53125
1.3375,-0.749,2.53125
0.749,-1.3375,2.53125
0.0,-1.3375,2.53125
1.4375,0.0,2.53125
1.4375,-0.805,2.53125
0.805,-1.4375,2.53125
0.0,-1.4375,2.53125
1.5,0.0,2.4
1.5,-0.84,2.4
0.84,-1.5,2.4
0.0,-1.5,2.4
-0.784,-1.4,2.4
-1.4,-0.784,2.4
-1.4,0.0,2.4
-0.749,-1.3375,2.53125
-1.3375,-0.749,2.53125
-1.3375,0.0,2.53125
-0.805,-1.4375,2.53125
-1.4375,-0.805,2.53125
-1.4375,0.0,2.53125
-0.84,-1.5,2.4
-1.5,-0.84,2.4
-1.5,0.0,2.4
-1.4,0.784,2.4
-0.784,1.4,2.4
0.0,1.4,2.4
-1.3375,0.749,2.53125
-0.749,1.3375,2.53125
0.0,1.3375,2.53125
-1.4375,0.805,2.53125
-0.805,1.4375,2.53125
0.0,1.4375,2.53125
-1.5,0.84,2.4
-0.84,1.5,2.4
0.0,1.5,2.4
0.784,1.4,2.4
1.4,0.784,2.4
0.749,1.3375,2.53125
1.3375,0.749,2.53125
0.805,1.4375,2.53125
1.4375,0.805,2.53125
0.84,1.5,2.4
1.5,0.84,2.4
1.75,0.0,1.875
1.75,-0.98,1.875
0.98,-1.75,1.875
0.0,-1.75,1.875
2.0,0.0,1.35
2.0,-1.12,1.35
1.12,-2.0,1.35
0.0,-2.0,1.35
2.0,0.0,0.9
2.0,-1.12,0.9
1.12,-2.0,0.9
0.0,-2.0,0.9
-0.98,-1.75,1.875
-1.75,-0.98,1.875
-1.75,0.0,1.875
-1.12,-2.0,1.35
-2.0,-1.12,1.35
-2.0,0.0,1.35
-1.12,-2.0,0.9
-2.0,-1.12,0.9
-2.0,0.0,0.9
-1.75,0.98,1.875
-0.98,1.75,1.875
0.0,1.75,1.875
-2.0,1.12,1.35
-1.12,2.0,1.35
0.0,2.0,1.35
-2.0,1.12,0.9
-1.12,2.0,0.9
0.0,2.0,0.9
0.98,1.75,1.875
1.75,0.98,1.875
1.12,2.0,1.35
2.0,1.12,1.35
1.12,2.0,0.9
2.0,1.12,0.9
2.0,0.0,0.45
2.0,-1.12,0.45
1.12,-2.0,0.45
0.0,-2.0,0.45
1.5,0.0,0.225
1.5,-0.84,0.225
0.84,-1.5,0.225
0.0,-1.5,0.225
1.5,0.0,0.15
1.5,-0.84,0.15
0.84,-1.5,0.15
0.0,-1.5,0.15
-1.12,-2.0,0.45
-2.0,-1.12,0.45
-2.0,0.0,0.45
-0.84,-1.5,0.225
-1.5,-0.84,0.225
-1.5,0.0,0.225
-0.84,-1.5,0.15
-1.5,-0.84,0.15
-1.5,0.0,0.15
-2.0,1.12,0.45
-1.12,2.0,0.45
0.0,2.0,0.45
-1.5,0.84,0.225
-0.84,1.5,0.225
0.0,1.5,0.225
-1.5,0.84,0.15
-0.84,1.5,0.15
0.0,1.5,0.15
1.12,2.0,0.45
2.0,1.12,0.45
0.84,1.5,0.225
1.5,0.84,0.225
0.84,1.5,0.15
1.5,0.84,0.15
-1.6,0.0,2.025
-1.6,-0.3,2.025
-1.5,-0.3,2.25
-1.5,0.0,2.25
-2.3,0.0,2.025
-2.3,-0.3,2.025
-2.5,-0.3,2.25
-2.5,0.0,2.25
-2.7,0.0,2.025
-2.7,-0.3,2.025
-3.0,-0.3,2.25
-3.0,0.0,2.25
-2.7,0.0,1.8
-2.7,-0.3,1.8
-3.0,-0.3,1.8
-3.0,0.0,1.8
-1.5,0.3,2.25
-1.6,0.3,2.025
-2.5,0.3,2.25
-2.3,0.3,2.025
-3.0,0.3,2.25
-2.7,0.3,2.025
-3.0,0.3,1.8
-2.7,0.3,1.8
-2.7,0.0,1.575
-2.7,-0.3,1.575
-3.0,-0.3,1.35
-3.0,0.0,1.35
-2.5,0.0,1.125
-2.5,-0.3,1.125
-2.65,-0.3,0.9375
-2.65,0.0,0.9375
-2.0,-0.3,0.9
-1.9,-0.3,0.6
-1.9,0.0,0.6
-3.0,0.3,1.35
-2.7,0.3,1.575
-2.65,0.3,0.9375
-2.5,0.3,1.125
-1.9,0.3,0.6
-2.0,0.3,0.9
1.7,0.0,1.425
1.7,-0.66,1.425
1.7,-0.66,0.6
1.7,0.0,0.6
2.6,0.0,1.425
2.6,-0.66,1.425
3.1,-0.66,0.825
3.1,0.0,0.825
2.3,0.0,2.1
2.3,-0.25,2.1
2.4,-0.25,2.025
2.4,0.0,2.025
2.7,0.0,2.4
2.7,-0.25,2.4
3.3,-0.25,2.4
3.3,0.0,2.4
1.7,0.66,0.6
1.7,0.66,1.425
3.1,0.66,0.825
2.6,0.66,1.425
2.4,0.25,2.025
2.3,0.25,2.1
3.3,0.25,2.4
2.7,0.25,2.4
2.8,0.0,2.475
2.8,-0.25,2.475
3.525,-0.25,2.49375
3.525,0.0,2.49375
2.9,0.0,2.475
2.9,-0.15,2.475
3.45,-0.15,2.5125
3.45,0.0,2.5125
2.8,0.0,2.4
2.8,-0.15,2.4
3.2,-0.15,2.4
3.2,0.0,2.4
3.525,0.25,2.49375
2.8,0.25,2.475
3.45,0.15,2.5125
2.9,0.15,2.475
3.2,0.15,2.4
2.8,0.15,2.4
0.0,0.0,3.15
0.0,-0.002,3.15
0.002,0.0,3.15
0.8,0.0,3.15
0.8,-0.45,3.15
0.45,-0.8,3.15
0.0,-0.8,3.15
0.0,0.0,2.85
0.2,0.0,2.7
0.2,-0.112,2.7
0.112,-0.2,2.7
0.0,-0.2,2.7
-0.002,0.0,3.15
-0.45,-0.8,3.15
-0.8,-0.45,3.15
-0.8,0.0,3.15
-0.112,-0.2,2.7
-0.2,-0.112,2.7
-0.2,0.0,2.7
0.0,0.002,3.15
-0.8,0.45,3.15
-0.45,0.8,3.15
0.0,0.8,3.15
-0.2,0.112,2.7
-0.112,0.2,2.7
0.0,0.2,2.7
0.45,0.8,3.15
0.8,0.45,3.15
0.112,0.2,2.7
0.2,0.112,2.7
0.4,0.0,2.55
0.4,-0.224,2.55
0.224,-0.4,2.55
0.0,-0.4,2.55
1.3,0.0,2.55
1.3,-0.728,2.55
0.728,-1.3,2.55
0.0,-1.3,2.55
1.3,0.0,2.4
1.3,-0.728,2.4
0.728,-1.3,2.4
0.0,-1.3,2.4
-0.224,-0.4,2.55
-0.4,-0.224,2.55
-0.4,0.0,2.55
-0.728,-1.3,2.55
-1.3,-0.728,2.55
-1.3,0.0,2.55
-0.728,-1.3,2.4
-1.3,-0.728,2.4
-1.3,0.0,2.4
-0.4,0.224,2.55
-0.224,0.4,2.55
0.0,0.4,2.55
-1.3,0.728,2.55
-0.728,1.3,2.55
0.0,1.3,2.55
-1.3,0.728,2.4
-0.728,1.3,2.4
0.0,1.3,2.4
0.224,0.4,2.55
0.4,0.224,2.55
0.728,1.3,2.55
1.3,0.728,2.55
0.728,1.3,2.4
1.3,0.728,2.4
0.0,0.0,0.0
1.5,0.0,0.15
1.5,0.84,0.15
0.84,1.5,0.15
0.0,1.5,0.15
1.5,0.0,0.075
1.5,0.84,0.075
0.84,1.5,0.075
0.0,1.5,0.075
1.425,0.0,0.0
1.425,0.798,0.0
0.798,1.425,0.0
0.0,1.425,0.0
-0.84,1.5,0.15
-1.5,0.84,0.15
-1.5,0.0,0.15
-0.84,1.5,0.075
-1.5,0.84,0.075
-1.5,0.0,0.075
-0.798,1.425,0.0
-1.425,0.798,0.0
-1.425,0.0,0.0
-1.5,-0.84,0.15
-0.84,-1.5,0.15
0.0,-1.5,0.15
-1.5,-0.84,0.075
-0.84,-1.5,0.075
0.0,-1.5,0.075
-1.425,-0.798,0.0
-0.798,-1.425,0.0
0.0,-1.425,0.0
0.84,-1.5,0.15
1.5,-0.84,0.15
0.84,-1.5,0.075
1.5,-0.84,0.075
0.798,-1.425,0.0
1.425,-0.798,0.0
"""

teaspoon="""16
1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32
33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48
49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64
65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96
97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112
113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128
129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144
145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160
161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176
177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192
193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208
209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224
225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240
241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256
256
-0.000107143,0.205357,0.0
0.0,0.196429,-0.0178571
0.0,0.196429,-0.0178571
0.000107143,0.205357,0.0
-0.0535714,0.205357,0.0
-0.0222714,0.178571,-0.0534286
0.0222714,0.178571,-0.0534286
0.0535714,0.205357,0.0
-0.107143,0.0952429,-0.0178571
-0.0446429,0.0952429,-0.0892857
0.0446429,0.0952429,-0.0892857
0.107143,0.0952429,-0.0178571
-0.107143,0.0,-0.0178571
-0.0446429,0.0,-0.0892857
0.0446429,0.0,-0.0892857
0.107143,0.0,-0.0178571
0.000107143,0.205357,0.0
0.000135714,0.207589,0.00446429
0.000157143,0.216518,0.00446429
0.000125,0.214286,0.0
0.0535714,0.205357,0.0
0.0613964,0.212054,0.0133571
0.0714286,0.220982,0.015625
0.0625,0.214286,0.0
0.107143,0.0952429,-0.0178571
0.122768,0.0952429,0.0
0.142857,0.0952429,0.00446429
0.125,0.0952429,-0.0178571
0.107143,0.0,-0.0178571
0.122768,0.0,0.0
0.142857,0.0,0.00446429
0.125,0.0,-0.0178571
0.000125,0.214286,0.0
0.0,0.205357,-0.0178571
0.0,0.205357,-0.0178571
-0.000125,0.214286,0.0
0.0625,0.214286,0.0
0.0267857,0.1875,-0.0625
-0.0267857,0.1875,-0.0625
-0.0625,0.214286,0.0
0.125,0.0952429,-0.0178571
0.0535714,0.0952429,-0.107143
-0.0535714,0.0952429,-0.107143
-0.125,0.0952429,-0.0178571
0.125,0.0,-0.0178571
0.0535714,0.0,-0.107143
-0.0535714,0.0,-0.107143
-0.125,0.0,-0.0178571
-0.000125,0.214286,0.0
-0.000157143,0.216518,0.00446429
-0.000135714,0.207589,0.00446429
-0.000107143,0.205357,0.0
-0.0625,0.214286,0.0
-0.0714286,0.220982,0.015625
-0.0613964,0.212054,0.0133571
-0.0535714,0.205357,0.0
-0.125,0.0952429,-0.0178571
-0.142857,0.0952429,0.00446429
-0.122768,0.0952429,0.0
-0.107143,0.0952429,-0.0178571
-0.125,0.0,-0.0178571
-0.142857,0.0,0.00446429
-0.122768,0.0,0.0
-0.107143,0.0,-0.0178571
-0.107143,0.0,-0.0178571
-0.0446429,0.0,-0.0892857
0.0446429,0.0,-0.0892857
0.107143,0.0,-0.0178571
-0.107143,-0.142857,-0.0178571
-0.0446429,-0.142857,-0.0892857
0.0446429,-0.142857,-0.0892857
0.107143,-0.142857,-0.0178571
-0.0133929,-0.160714,0.0386893
-0.00557857,-0.160714,0.0386893
0.00557857,-0.160714,0.0386893
0.0133929,-0.160714,0.0386893
-0.0133929,-0.25,0.0535714
-0.00557857,-0.25,0.0535714
0.00557857,-0.25,0.0535714
0.0133929,-0.25,0.0535714
0.107143,0.0,-0.0178571
0.122768,0.0,0.0
0.142857,0.0,0.00446429
0.125,0.0,-0.0178571
0.107143,-0.142857,-0.0178571
0.122768,-0.142857,0.0
0.142857,-0.142857,0.00446429
0.125,-0.142857,-0.0178571
0.0133929,-0.160714,0.0386893
0.0153464,-0.160714,0.0386893
0.0178571,-0.160714,0.0314357
0.015625,-0.160714,0.0297607
0.0133929,-0.25,0.0535714
0.0153464,-0.25,0.0535714
0.0178571,-0.25,0.0463179
0.015625,-0.25,0.0446429
0.125,0.0,-0.0178571
0.0535714,0.0,-0.107143
-0.0535714,0.0,-0.107143
-0.125,0.0,-0.0178571
0.125,-0.142857,-0.0178571
0.0535714,-0.142857,-0.107143
-0.0535714,-0.142857,-0.107143
-0.125,-0.142857,-0.0178571
0.015625,-0.160714,0.0297607
0.00669643,-0.160714,0.0230643
-0.00781071,-0.160714,0.0208321
-0.015625,-0.160714,0.0297607
0.015625,-0.25,0.0446429
0.00669643,-0.25,0.0379464
-0.00781071,-0.25,0.0357143
-0.015625,-0.25,0.0446429
-0.125,0.0,-0.0178571
-0.142857,0.0,0.00446429
-0.122768,0.0,0.0
-0.107143,0.0,-0.0178571
-0.125,-0.142857,-0.0178571
-0.142857,-0.142857,0.00446429
-0.122768,-0.142857,0.0
-0.107143,-0.142857,-0.0178571
-0.015625,-0.160714,0.0297607
-0.0175786,-0.160714,0.0319929
-0.0153464,-0.160714,0.0386893
-0.0133929,-0.160714,0.0386893
-0.015625,-0.25,0.0446429
-0.0175786,-0.25,0.046875
-0.0153464,-0.25,0.0535714
-0.0133929,-0.25,0.0535714
-0.0133929,-0.25,0.0535714
-0.00557857,-0.25,0.0535714
0.00557857,-0.25,0.0535714
0.0133929,-0.25,0.0535714
-0.0133929,-0.46425,0.0892857
-0.00557857,-0.46425,0.0892857
0.00557857,-0.46425,0.0892857
0.0133929,-0.46425,0.0892857
-0.0446429,-0.678571,0.0535714
-0.00892857,-0.678571,0.0625
0.00892857,-0.678571,0.0625
0.0446429,-0.678571,0.0535714
-0.0446429,-0.857143,0.0357143
-0.00892857,-0.857143,0.0446429
0.00892857,-0.857143,0.0446429
0.0446429,-0.857143,0.0357143
0.0133929,-0.25,0.0535714
0.0153464,-0.25,0.0535714
0.0178571,-0.25,0.0463179
0.015625,-0.25,0.0446429
0.0133929,-0.46425,0.0892857
0.0153464,-0.464286,0.0892857
0.0178571,-0.46425,0.0820321
0.015625,-0.46425,0.0803571
0.0446429,-0.678571,0.0535714
0.0535714,-0.678571,0.0513393
0.0535714,-0.678571,0.0334821
0.0446429,-0.678571,0.0357143
0.0446429,-0.857143,0.0357143
0.0535714,-0.857143,0.0334821
0.0535714,-0.857143,0.015625
0.0446429,-0.857143,0.0178571
0.015625,-0.25,0.0446429
0.00669643,-0.25,0.0379464
-0.00781071,-0.25,0.0357143
-0.015625,-0.25,0.0446429
0.015625,-0.46425,0.0803571
0.00669643,-0.464286,0.0736607
-0.00781071,-0.46425,0.0714286
-0.015625,-0.46425,0.0803571
0.0446429,-0.678571,0.0357143
0.00892857,-0.678571,0.0446429
-0.00892857,-0.678571,0.0446429
-0.0446429,-0.678571,0.0357143
0.0446429,-0.857143,0.0178571
0.00892857,-0.857143,0.0267857
-0.00892857,-0.857143,0.0267857
-0.0446429,-0.857143,0.0178571
-0.015625,-0.25,0.0446429
-0.0175786,-0.25,0.046875
-0.0153464,-0.25,0.0535714
-0.0133929,-0.25,0.0535714
-0.015625,-0.46425,0.0803571
-0.0175786,-0.464286,0.0825893
-0.0153464,-0.464286,0.0892857
-0.0133929,-0.46425,0.0892857
-0.0446429,-0.678571,0.0357143
-0.0535714,-0.678571,0.0334821
-0.0535714,-0.678571,0.0513393
-0.0446429,-0.678571,0.0535714
-0.0446429,-0.857143,0.0178571
-0.0535714,-0.857143,0.015625
-0.0535714,-0.857143,0.0334821
-0.0446429,-0.857143,0.0357143
-0.0446429,-0.857143,0.0357143
-0.00892857,-0.857143,0.0446429
0.00892857,-0.857143,0.0446429
0.0446429,-0.857143,0.0357143
-0.0446429,-0.928571,0.0285714
-0.00892857,-0.928571,0.0375
0.00892857,-0.928571,0.0375
0.0446429,-0.928571,0.0285714
-0.0539286,-0.999643,0.0178571
0.000357143,-0.999643,0.0178571
0.0,-0.999643,0.0178571
0.0535714,-0.999643,0.0178571
-0.000357143,-1,0.0178571
0.000357143,-1,0.0178571
0.0,-1,0.0178571
0.0,-1,0.0178571
0.0446429,-0.857143,0.0357143
0.0535714,-0.857143,0.0334821
0.0535714,-0.857143,0.015625
0.0446429,-0.857143,0.0178571
0.0446429,-0.928571,0.0285714
0.0535714,-0.928571,0.0263393
0.0535714,-0.928571,0.00848214
0.0446429,-0.928571,0.0107143
0.0535714,-0.999643,0.0178571
0.0669643,-0.999643,0.0178571
0.0673214,-0.999643,0.0
0.0539286,-0.999643,0.0
0.0,-1,0.0178571
0.0,-1,0.0178571
0.000357143,-1,0.0
0.000357143,-1,0.0
0.0446429,-0.857143,0.0178571
0.00892857,-0.857143,0.0267857
-0.00892857,-0.857143,0.0267857
-0.0446429,-0.857143,0.0178571
0.0446429,-0.928571,0.0107143
0.00892857,-0.928571,0.0196429
-0.00892857,-0.928571,0.0196429
-0.0446429,-0.928571,0.0107143
0.0539286,-0.999643,0.0
0.000357143,-0.999643,0.0
-0.000357143,-0.999643,0.0
-0.0539286,-0.999643,0.0
0.000357143,-1,0.0
0.000357143,-1,0.0
-0.000357143,-1,0.0
-0.000357143,-1,0.0
-0.0446429,-0.857143,0.0178571
-0.0535714,-0.857143,0.015625
-0.0535714,-0.857143,0.0334821
-0.0446429,-0.857143,0.0357143
-0.0446429,-0.928571,0.0107143
-0.0535714,-0.928571,0.00848214
-0.0535714,-0.928571,0.0263393
-0.0446429,-0.928571,0.0285714
-0.0539286,-0.999643,0.0
-0.0673214,-0.999643,0.0
-0.0675,-0.999643,0.0178571
-0.0539286,-0.999643,0.0178571
-0.000357143,-1,0.0
-0.000357143,-1,0.0
-0.000535714,-1,0.0178571
-0.000357143,-1,0.0178571
"""
