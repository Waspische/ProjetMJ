CREATE TABLE Membre (ID int(10) NOT NULL AUTO_INCREMENT, NomMembre varchar(255), PrenomMembre varchar(255), PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Reservation (ID int(10) NOT NULL AUTO_INCREMENT, MembreID int(10) NOT NULL, DateReservation varchar(255), PRIMARY KEY (ID)) ENGINE=InnoDB;
ALTER TABLE Reservation ADD INDEX possede (MembreID), ADD CONSTRAINT possede FOREIGN KEY (MembreID) REFERENCES Membre (ID);
