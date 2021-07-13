import resolve from '@rollup/plugin-node-resolve'; // locate and bundle dependencies in node_modules (mandatory)
import { terser } from "rollup-plugin-terser"; // code minification (optional)
import { getBabelOutputPlugin } from '@rollup/plugin-babel';
import typescript from 'rollup-plugin-typescript2';

export default {
	input: 'src/modelviewer.ts',

	output: [
		{
			format: 'esm',
			name: 'ModelViewer',
			file: 'modelviewer.js',
			sourcemap: false
		}
	],
	plugins: [

		typescript({ abortOnError: false }),

		resolve(),

		getBabelOutputPlugin({
			presets: [
				'@babel/preset-env'
			],
			retainLines: true
		}),

		//terser()
	]
};
