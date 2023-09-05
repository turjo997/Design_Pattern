package Solid.InterfaceSegragation.good;

//Implemented method what is actual being operated by this.
//We don't had to bother about file operation as interface segregated.


public class DBDaoConnection implements DBInterface , DAOInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
