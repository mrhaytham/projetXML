package com.ujm.xmltech.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.jpa.impl.JPAQuery;
import com.ujm.xmltech.dao.TransactionDao;
import com.ujm.xmltech.entity.QTransaction;
import com.ujm.xmltech.entity.Transaction;
import com.ujm.xmltech.entity.fileHeader;
import com.ujm.xmltech.utils.BankSimulationConstants;

@Repository("TransactionDao")
public class TransactionDaoImpl implements TransactionDao {
    @PersistenceContext(unitName = BankSimulationConstants.PERSISTENCE_UNIT)
    protected EntityManager entityManager;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, value = BankSimulationConstants.TRANSACTION_MANAGER)
    public void createTransaction(Transaction transaction) {
        entityManager.persist(transaction);
    }

    @Override
    public Transaction findTransactionById(long id) {
        JPAQuery q = new JPAQuery();
        QTransaction transaction = QTransaction.transaction;
        q.from(transaction);
        q.where(transaction.id.eq(id));
        return q.uniqueResult(transaction);
    }

	@Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, value = BankSimulationConstants.TRANSACTION_MANAGER)
	public void createFileHeader(fileHeader fh) {
        entityManager.persist(fh);
	}

}
