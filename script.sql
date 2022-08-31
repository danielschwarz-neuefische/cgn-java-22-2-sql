SELECT 'hello world'

CREATE TABLE tierheim
(
    id      varchar(255),
    name    varchar(4000),
    adresse varchar(4000)
)

INSERT INTO tierheim (id, name, adresse)
VALUES ('1', 'Tierheim 1', 'Adresse 1')
insert into tierheim (id, name, adresse)
values ('2', 'Tierheim 2', 'Adresse 2')
insert into tierheim (id, name, adresse)
values ('3', 'Tierheim 3', 'Adresse 3')
insert into tierheim (id, name, adresse)
values ('4', 'Tierheim 4 (in Planung)', NULL)
insert into tierheim (id, name, adresse, nimmt_reptilien_auf)
values ('5', 'Tierheim 5', 'Buxtehude', 'TRUE')

alter table tierheim
    add nimmt_reptilien_auf bit

update tierheim
set adresse = 'Adresse 4',
    name    = 'Tierheim 4'
where id = '4'

delete
from tierheim
where id = '2'

select name, len(adresse)
from tierheim
where tierheim.nimmt_reptilien_auf = 'TRUE'
