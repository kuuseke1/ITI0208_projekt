module.exports = {
    devServer: {
        port: 8081,
        proxy: { '/add': { target: 'http://localhost:8080', secure: false } } }
};