/*
 * Copyright 2011-2013 Blender Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

/* OpenCL kernel entry points - unfinished */

#include "kernel_compat_opencl.h"
#include "kernel_math.h"
#include "kernel_types.h"
#include "kernel_globals.h"

#include "kernel_film.h"
#include "kernel_path.h"
#include "kernel_displace.h"

__kernel void kernel_ocl_path_trace(
	__constant KernelData *data,
	__global float *buffer,
	__global uint *rng_state,

#define KERNEL_TEX(type, ttype, name) \
	__global type *name,
#include "kernel_textures.h"

	int sample,
	int sx, int sy, int sw, int sh, int offset, int stride)
{
	KernelGlobals kglobals, *kg = &kglobals;

	kg->data = data;

#define KERNEL_TEX(type, ttype, name) \
	kg->name = name;
#include "kernel_textures.h"

	int x = sx + get_global_id(0);
	int y = sy + get_global_id(1);

	if(x < sx + sw && y < sy + sh)
		kernel_path_trace(kg, buffer, rng_state, sample, x, y, offset, stride);
}

__kernel void kernel_ocl_convert_to_byte(
	__constant KernelData *data,
	__global uchar4 *rgba,
	__global float *buffer,

#define KERNEL_TEX(type, ttype, name) \
	__global type *name,
#include "kernel_textures.h"

	float sample_scale,
	int sx, int sy, int sw, int sh, int offset, int stride)
{
	KernelGlobals kglobals, *kg = &kglobals;

	kg->data = data;

#define KERNEL_TEX(type, ttype, name) \
	kg->name = name;
#include "kernel_textures.h"

	int x = sx + get_global_id(0);
	int y = sy + get_global_id(1);

	if(x < sx + sw && y < sy + sh)
		kernel_film_convert_to_byte(kg, rgba, buffer, sample_scale, x, y, offset, stride);
}

__kernel void kernel_ocl_convert_to_half_float(
	__constant KernelData *data,
	__global uchar4 *rgba,
	__global float *buffer,

#define KERNEL_TEX(type, ttype, name) \
	__global type *name,
#include "kernel_textures.h"

	float sample_scale,
	int sx, int sy, int sw, int sh, int offset, int stride)
{
	KernelGlobals kglobals, *kg = &kglobals;

	kg->data = data;

#define KERNEL_TEX(type, ttype, name) \
	kg->name = name;
#include "kernel_textures.h"

	int x = sx + get_global_id(0);
	int y = sy + get_global_id(1);

	if(x < sx + sw && y < sy + sh)
		kernel_film_convert_to_half_float(kg, rgba, buffer, sample_scale, x, y, offset, stride);
}

__kernel void kernel_ocl_shader(
	__constant KernelData *data,
	__global uint4 *input,
	__global float4 *output,

#define KERNEL_TEX(type, ttype, name) \
	__global type *name,
#include "kernel_textures.h"

	int type, int sx, int sw)
{
	KernelGlobals kglobals, *kg = &kglobals;

	kg->data = data;

#define KERNEL_TEX(type, ttype, name) \
	kg->name = name;
#include "kernel_textures.h"

	int x = sx + get_global_id(0);

	if(x < sx + sw)
		kernel_shader_evaluate(kg, input, output, (ShaderEvalType)type, x);
}

