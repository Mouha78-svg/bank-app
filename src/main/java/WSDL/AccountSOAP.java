
package WSDL;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "AccountSOAP", targetNamespace = "http://serverSOAP.banking.javaguides.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountSOAP {


    /**
     * 
     * @param arg0
     * @return
     *     returns WSDL.AccountDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAccount", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.CreateAccount")
    @ResponseWrapper(localName = "createAccountResponse", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.CreateAccountResponse")
    @Action(input = "http://serverSOAP.banking.javaguides.net/AccountSOAP/createAccountRequest", output = "http://serverSOAP.banking.javaguides.net/AccountSOAP/createAccountResponse")
    public AccountDto createAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        AccountDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns WSDL.AccountDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccountById", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.GetAccountById")
    @ResponseWrapper(localName = "getAccountByIdResponse", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.GetAccountByIdResponse")
    @Action(input = "http://serverSOAP.banking.javaguides.net/AccountSOAP/getAccountByIdRequest", output = "http://serverSOAP.banking.javaguides.net/AccountSOAP/getAccountByIdResponse")
    public AccountDto getAccountById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns WSDL.AccountDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deposit", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.Deposit")
    @ResponseWrapper(localName = "depositResponse", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.DepositResponse")
    @Action(input = "http://serverSOAP.banking.javaguides.net/AccountSOAP/depositRequest", output = "http://serverSOAP.banking.javaguides.net/AccountSOAP/depositResponse")
    public AccountDto deposit(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns WSDL.AccountDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.WithdrawResponse")
    @Action(input = "http://serverSOAP.banking.javaguides.net/AccountSOAP/withdrawRequest", output = "http://serverSOAP.banking.javaguides.net/AccountSOAP/withdrawResponse")
    public AccountDto withdraw(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @return
     *     returns java.util.List<WSDL.AccountDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllAccounts", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.GetAllAccounts")
    @ResponseWrapper(localName = "getAllAccountsResponse", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.GetAllAccountsResponse")
    @Action(input = "http://serverSOAP.banking.javaguides.net/AccountSOAP/getAllAccountsRequest", output = "http://serverSOAP.banking.javaguides.net/AccountSOAP/getAllAccountsResponse")
    public List<AccountDto> getAllAccounts();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAccount", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.DeleteAccount")
    @ResponseWrapper(localName = "deleteAccountResponse", targetNamespace = "http://serverSOAP.banking.javaguides.net/", className = "WSDL.DeleteAccountResponse")
    @Action(input = "http://serverSOAP.banking.javaguides.net/AccountSOAP/deleteAccountRequest", output = "http://serverSOAP.banking.javaguides.net/AccountSOAP/deleteAccountResponse")
    public void deleteAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}
