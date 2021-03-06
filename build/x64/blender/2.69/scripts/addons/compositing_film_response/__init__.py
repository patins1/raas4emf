# ##### BEGIN GPL LICENSE BLOCK #####
#
#  This program is free software; you can redistribute it and/or
#  modify it under the terms of the GNU General Public License
#  as published by the Free Software Foundation; either version 2
#  of the License, or (at your option) any later version.
#
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software Foundation,
#  Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
#
# ##### END GPL LICENSE BLOCK #####

# <pep8 compliant>

bl_info = {
    "name": "Film Response Curves",
    "author": "Brecht Van Lommel",
    "version": (0, 1),
    "blender": (2, 63, 0),
    "location": "Node Editor > Panels > Film Response",
    "description": "Apply film response preset to RGB Curves node",
    "warning": "",
    "wiki_url": "http://wiki.blender.org/index.php/Extensions:2.6/Py/"\
        "Scripts/Render/Film_Response",
    "tracker_url": "https://projects.blender.org/tracker/index.php?"\
        "func=detail&aid=33246",
    "support": 'OFFICIAL',
    "category": "Compositing"}

import bpy
import math

def srgb_to_linearrgb(c):
    if c < 0.04045:
        if c < 0.0:
            return 0.0
        else:
            return c * (1.0 / 12.92)
    else:
        return math.pow((c + 0.055) * (1.0 / 1.055), 2.4)

def apply_curve_table(curve, table):
    num = len(table)
    
    while len(curve.points) > 2:
        curve.points.remove(curve.points[0])
    
    curve.points[0].location = (0.0, srgb_to_linearrgb(table[0]))
    curve.points[-1].location = (1.0, srgb_to_linearrgb(table[-1]))
    
    for i in range(1, num-1, 5):
        x = i/(num-1)
        y = srgb_to_linearrgb(table[i])
        
        curve.points.new(x, y)        

def apply_curvemapping(node, response_name):
    from . import film_response_curves
    
    Rcurve, Gcurve, Bcurve = node.mapping.curves[0:3]
    
    for FR in film_response_curves.FILM_RESPONSE:
        brand, name, log, isrgb, I_R, B_R, I_G, B_G, I_B, B_B = FR
        
        if name == response_name:            
            apply_curve_table(Rcurve, B_R)
            
            if isrgb:
                apply_curve_table(Gcurve, B_G)
                apply_curve_table(Bcurve, B_B)
            else:
                apply_curve_table(Gcurve, B_R)
                apply_curve_table(Bcurve, B_R)
            
            node.mapping.update()
            node.inputs[0].default_value = node.inputs[0].default_value
        
#ntree = bpy.context.scene.node_tree
#node = ntree.nodes["RGB Curves"]

response_curve_items = (
("", "Agfa", ""),
("Agfacolor Futura 100", "Futura 100", ""),
("Agfacolor Futura 200", "Futura 200", ""),
("Agfacolor Futura 400", "Futura 400", ""),
("Agfacolor Futura II 100", "Futura II 100", ""),
("Agfacolor Futura II 200", "Futura II 200", ""),
("Agfacolor Futura II 400", "Futura II 400", ""),
("Agfacolor HDC 100 plus", "HDC 100 plus", ""),
("Agfacolor HDC 400 plus", "HDC 400 plus", ""),
("Agfacolor HDC 200 plus", "HDC 200 plus", ""),
("Agfacolor Optima II 100", "Optima II 100", ""),
("Agfacolor Optima II 200", "Optima II 200", ""),
("Agfacolor Ultra 050", "Ultra 050", ""),
("", "Agfa", ""),
("Agfacolor Vista 100", "Vista 100", ""),
("Agfacolor Vista 200", "Vista 200", ""),
("Agfacolor Vista 400", "Vista 400", ""),
("Agfacolor Vista 800", "Vista 800", ""),
("Agfachrome CT Precisa 100", "CT Precisa 100", ""),
("Agfachrome CT Precisa 200", "CT Precisa 200", ""),
("Agfachrome RSX2 050", "Agfachrome RSX2 050", ""),
("Agfachrome RSX2 100", "Agfachrome RSX2 100", ""),
("Agfachrome RSX2 200", "Agfachrome RSX2 200", ""),
("Advantix 100", "Advantix 100", ""),
("Advantix 200", "Advantix 200", ""),
("Advantix 400", "Advantix 400", ""),
("", "Kodak", ""),
("Gold 100", "Gold 100", ""),
("Gold 200", "Gold 200", ""),
("Max Zoom 800", "Max Zoom 800", ""),
("Portra 100T", "Portra 100T", ""),
("Portra 160NC", "Portra 160NC", ""),
("Portra 160VC", "Portra 160VC", ""),
("Portra 800", "Portra 800", ""),
("Portra 400VC", "Portra 400VC", ""),
("Portra 400NC", "Portra 400NC", ""),
("", "Kodak", ""),
("Ektachrome 100 plus", "Ektachrome 100 plus", ""),
("Ektachrome 320T", "Ektachrome 320T", ""),
("Ektachrome 400X", "Ektachrome 400X", ""),
("Ektachrome 64", "Ektachrome 64", ""),
("Ektachrome 64T", "Ektachrome 64T", ""),
("Ektachrome E100S", "Ektachrome E100S", ""),
("Ektachrome 100", "Ektachrome 100", ""),
("Kodachrome 200", "Kodachrome 200", ""),
("Kodachrome 25", "Kodachrome 25", ""),
("Kodachrome 64", "Kodachrome 64", ""),
("", "Fujifilm", ""),
("F-125", "F-125", ""),
("F-250", "F-250", ""),
("F-400", "F-400", ""),
("FCI", "FCI", ""),
("FP2900Z", "FP2900Z", ""),
("", "Eastman", ""),
("Double X Neg 12min", "Double X Neg 12min", ""),
("Double X Neg 6min", "Double X Neg 6min", ""),
("Double X Neg 5min", "Double X Neg 5min", ""),
("Double X Neg 4min", "Double X Neg 4min", ""),
("", "Canon", ""),
("Optura 981111", "Optura 981111", ""),
("Optura 981113", "Optura 981113", ""),
("Optura 981114", "Optura 981114", ""),
("Optura 981111.SLRR", "Optura 981111.SLRR", "")
)

def film_response_update(self, context):
    bpy.ops.node.film_response()

bpy.types.Scene.mango_response_curve = bpy.props.EnumProperty(name="Response Curve", description="Measured camera film response",
        items=response_curve_items, default="Advantix 400", update=film_response_update)

class FilmResponseOperator(bpy.types.Operator):
    '''Set film response preset on active RGB Curves node'''
    bl_idname = "node.film_response"
    bl_label = "Set Film Response"

    @classmethod
    def poll(cls, context):
        node = context.active_node
        return node and node.type == 'CURVE_RGB'

    def execute(self, context):
        node = context.active_node
        apply_curvemapping(node, context.scene.mango_response_curve)
        return {'FINISHED'}

class NODE_PT_film_response(bpy.types.Panel):
    bl_space_type = 'NODE_EDITOR'
    bl_region_type = 'UI'
    bl_label = "Film Response"

    @classmethod
    def poll(cls, context):
        node = context.active_node
        return node and node.type == 'CURVE_RGB'

    def draw(self, context):
        layout = self.layout
        
        layout.prop(context.scene, "mango_response_curve", text="")

def register():
    bpy.utils.register_class(FilmResponseOperator)
    bpy.utils.register_class(NODE_PT_film_response)

def unregister():
    bpy.utils.unregister_class(FilmResponseOperator)
    bpy.utils.unregister_class(NODE_PT_film_response)

if __name__ == "__main__":
    register()
    
