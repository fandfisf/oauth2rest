CREATE TABLE  PAINTERS
(
  PAINTER_ID NUMBER(10) NOT NULL,
  FIRST_NAME VARCHAR2(255) NOT NULL,
  LAST_NAME VARCHAR2(255) NOT NULL,
  PSEUDONYM VARCHAR2(255) NOT NULL,
  BIRTH_DATE DATE ,
  DATE_OF_DEATH DATE,
  PICTURE VARCHAR2(4096),
  VERSION NUMBER(6)
);
CREATE UNIQUE INDEX PK_PAINTERS_ID ON PAINTERS(PAINTER_ID);
--If a painter clashes on all of these, we will treat them as the same person.
CREATE UNIQUE INDEX UK_PAINTERS_DETAILS ON PAINTERS(FIRST_NAME, LAST_NAME, PSEUDONYM);

CREATE SEQUENCE SEQ_PAINTERS
    MINVALUE 10
    MAXVALUE 9999999999
    START WITH 10
    INCREMENT BY 1;

INSERT INTO PAINTERS values  (1, 'Vincent', 'van Gogh', 'The Little Painter Fellow', NULL, NULL, 'https://upload.wikimedia.org/wikipedia/commons/d/df/Van_Gogh_self_portrait_as_an_artist.jpg',0);
INSERT INTO PAINTERS values  (2, 'San', 'of Africa', 'Pre-historic San People', NULL, NULL, 'https://en.wikipedia.org/wiki/San_people#/media/File:Namibian_Bushmen_Girls.JPG',0);
