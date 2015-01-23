/*
* Install json-server module & use this file as argument
* to generate a REST service with predefined data.
*/
module.exports = function() {
    var faker = require("faker");
    var _ = require("lodash");
    return {
        monsters: _.times(20, function(n) {
            return {
                id: n,
                name: faker.name.findName(),
                level: 1,
                role: faker.name.firstName(),
                race: "human",
                attacks: _.times(2, function(k) {
                    return {
                        id: k,
                        name: faker.company.catchPhrase(),
                        damage: 3
                    }
                })
            }
        })
    }
}