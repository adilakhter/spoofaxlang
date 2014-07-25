mobl.provides('model');
mobl.provides('model');
mobl.provides('mobl');

model.Task = persistence.define('model__Task', {
'name': 'VARCHAR(255)',
'description': 'VARCHAR(255)',
'done': 'BOOL',
'date': 'DATE'
});


model.Task.textIndex('description');
model.Task.textIndex('name');
