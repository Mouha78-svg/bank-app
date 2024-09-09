
package WSDL;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WSDL package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CreateAccount_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "createAccount");
    private static final QName _CreateAccountResponse_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "createAccountResponse");
    private static final QName _DeleteAccount_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "deleteAccount");
    private static final QName _DeleteAccountResponse_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "deleteAccountResponse");
    private static final QName _Deposit_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "deposit");
    private static final QName _DepositResponse_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "depositResponse");
    private static final QName _GetAccountById_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "getAccountById");
    private static final QName _GetAccountByIdResponse_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "getAccountByIdResponse");
    private static final QName _GetAllAccounts_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "getAllAccounts");
    private static final QName _GetAllAccountsResponse_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "getAllAccountsResponse");
    private static final QName _Withdraw_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "withdraw");
    private static final QName _WithdrawResponse_QNAME = new QName("http://serverSOAP.banking.javaguides.net/", "withdrawResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WSDL
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     * @return
     *     the new instance of {@link CreateAccount }
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     * @return
     *     the new instance of {@link CreateAccountResponse }
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link DeleteAccount }
     * 
     * @return
     *     the new instance of {@link DeleteAccount }
     */
    public DeleteAccount createDeleteAccount() {
        return new DeleteAccount();
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAccountResponse }
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     * @return
     *     the new instance of {@link Deposit }
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     * @return
     *     the new instance of {@link DepositResponse }
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link GetAccountById }
     * 
     * @return
     *     the new instance of {@link GetAccountById }
     */
    public GetAccountById createGetAccountById() {
        return new GetAccountById();
    }

    /**
     * Create an instance of {@link GetAccountByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountByIdResponse }
     */
    public GetAccountByIdResponse createGetAccountByIdResponse() {
        return new GetAccountByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     * @return
     *     the new instance of {@link GetAllAccounts }
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllAccountsResponse }
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     * @return
     *     the new instance of {@link Withdraw }
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     * @return
     *     the new instance of {@link WithdrawResponse }
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link AccountDto }
     * 
     * @return
     *     the new instance of {@link AccountDto }
     */
    public AccountDto createAccountDto() {
        return new AccountDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "deleteAccount")
    public JAXBElement<DeleteAccount> createDeleteAccount(DeleteAccount value) {
        return new JAXBElement<>(_DeleteAccount_QNAME, DeleteAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "deleteAccountResponse")
    public JAXBElement<DeleteAccountResponse> createDeleteAccountResponse(DeleteAccountResponse value) {
        return new JAXBElement<>(_DeleteAccountResponse_QNAME, DeleteAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountById }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "getAccountById")
    public JAXBElement<GetAccountById> createGetAccountById(GetAccountById value) {
        return new JAXBElement<>(_GetAccountById_QNAME, GetAccountById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "getAccountByIdResponse")
    public JAXBElement<GetAccountByIdResponse> createGetAccountByIdResponse(GetAccountByIdResponse value) {
        return new JAXBElement<>(_GetAccountByIdResponse_QNAME, GetAccountByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "getAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "getAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serverSOAP.banking.javaguides.net/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

}
