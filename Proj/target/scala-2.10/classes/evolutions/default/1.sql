# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbCompany (
  id                        varchar(255) not null,
  name                      varchar(255),
  address                   varchar(255),
  detail                    varchar(255),
  constraint pk_tbCompany primary key (id))
;

create table tbMovie (
  id                        varchar(255) not null,
  title                     varchar(255),
  actor                     varchar(255),
  actress                   varchar(255),
  year                      varchar(255),
  company_id                varchar(255),
  constraint pk_tbMovie primary key (id))
;

alter table tbMovie add constraint fk_tbMovie_company_1 foreign key (company_id) references tbCompany (id) on delete restrict on update restrict;
create index ix_tbMovie_company_1 on tbMovie (company_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbCompany;

drop table tbMovie;

SET FOREIGN_KEY_CHECKS=1;

