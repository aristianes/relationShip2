CREATE TABLE CUSTOMER (
	ID int,
    FIRST_NAME_CUSTOMER varchar(255),
    LAST_NAME_CUSTOMER varchar(255),
	DOCUMENT_CUSTOMER varchar(255),
	PRIMARY KEY(ID)
	);

	CREATE TABLE ADDRESS (
    	ID int,
        LOGRADOURO_ADDRESS varchar(255),
        CEP_ADDRESS varchar(255),
    	CIDADE_ADDRESS varchar(255),
    	CUSTOMER_ID int,
    	PRIMARY KEY(ID)
    	);

    	ALTER TABLE IF EXISTS ADDRESS ADD CONSTRAINT CUSTOMER_ADDRESS FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER;

    	CREATE TABLE PURCHASES (
        	ID int,
            NOME_PURCHASES varchar(255),
            TIPO_PURCHASES varchar(255),
        	VALOR_PURCHASES varchar(255),
            CUSTOMER_ID int,
        	PRIMARY KEY(ID)
        	);

        	ALTER TABLE IF EXISTS PURCHASES ADD CONSTRAINT CUSTOMER_PURCHASES FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER;
