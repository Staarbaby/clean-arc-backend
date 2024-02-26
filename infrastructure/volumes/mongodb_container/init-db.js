db = db.getSiblingDB('ftl-auth-service');
db.createCollection('firstCollection');

db = db.getSiblingDB('clean-acr-example');
db.createCollection('firstCollection');