CREATE SEQUENCE seq_ddev;
create table Default_Device (
ID integer not null,
device_name varchar2(1024),
description varchar2(2048),
created timestamp
);
alter table Default_Device add constraint PK_DDev PRIMARY KEY (ID);

