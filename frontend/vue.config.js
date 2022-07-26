const path = require("path");

module.exports = {
	devServer: {
		proxy: 'http://localhost:8765'
	},
	indexPath: '../../templates/vue/index.html',
	publicPath: '/vue',
	outputDir: path.resolve(__dirname, "../src/main/resources/static/vue")
}
