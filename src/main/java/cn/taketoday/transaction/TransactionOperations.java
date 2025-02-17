/**
 * Original Author -> 杨海健 (taketoday@foxmail.com) https://taketoday.cn
 * Copyright © TODAY & 2017 - 2020 All Rights Reserved.
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package cn.taketoday.transaction;

/**
 * @author Today <br>
 *
 *         2018-12-30 20:58
 */
public interface TransactionOperations {

  /**
   * Execute the action specified by the given callback object within a
   * transaction.
   * <p>
   * Allows for returning a result object created within the transaction, that is,
   * a domain object or a collection of domain objects. A RuntimeException thrown
   * by the callback is treated as a fatal exception that enforces a rollback.
   * Such an exception gets propagated to the caller of the template.
   *
   * @param action
   *            the callback object that specifies the transactional action
   * @return a result object returned by the callback, or {@code null} if none
   * @throws TransactionException
   *             in case of initialization, rollback, or system errors
   * @throws RuntimeException
   *             if thrown by the TransactionCallback
   */
  <T> T execute(TransactionCallback<T> action) throws TransactionException;

}
