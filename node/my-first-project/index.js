const CountStream = require('./countstream');
const countStream = new CountStream('ross');
const http = require('http');

http.get('http://en.wikipedia.org', function(res) {
    res.pipe(countStream);
});

countStream.on('total', function(count) {
    console.log('Total matches:', count);
});
