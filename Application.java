/*
#  Licensed to the Apache Software Foundation (ASF) under one
#  or more contributor license agreements.  See the NOTICE file
#  distributed with this work for additional information
#  regarding copyright ownership.  The ASF licenses this file
#  to you under the Apache License, Version 2.0 (the
#  "License"); you may not use this file except in compliance
#  with the License.  You may obtain a copy of the License at
#
#  http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing,
#  software distributed under the License is distributed on an
#  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
#  KIND, either express or implied.  See the License for the
#  specific language governing permissions and limitations
#  under the License.
*/

package objs;

public class Application
/**
 * @author Claudia Iacob
 * 
 * @param   id the applications id
 * @param   no the applications number
 * @param   rating the applications rating
 * @param   price   the applications price
 * @param    norates 
 */
{
	private String id;
	private String no;
	private double rating;
	private double price;
	private double norates;
	

	public double getRating() {
            /**
             * @return returns the applications rating
             */
		return rating;
	}

	public void setRating(double rating) {
            /**
             * @param rating, the rating to apply to the app       * 
             */
		this.rating = rating;
	}

	public double getPrice() {
            /**
             * @return the price of the app
             */
		return price;
	}

	public void setPrice(double price) {
            /**
             * @param price, the price to set for the app
             */
		this.price = price;
	}

	public double getNorates() {
            /**
             * @return the norate
             */
		return norates;
	}

	public void setNorates(double norates) {
                /**
                 * @param norates  the norates to set for the app
                 */
		this.norates = norates;
	}

	public Application()
	{
		id = new String();
		no = new String();
	}

	public String getId() {
                /**
                 * @returns the app id
                 */
		return id;
	}

	public void setId(String id) {
            /**
             * @params id, sets the new id for the app
             */
		this.id = id;
	}

	public String getNo() {
            /**
             * @returns returns the no.
             */
		return no;
	}

	public void setNo(String no) {
            /**
             * @params no, sets the new no for the app
             */
		this.no = no;
	}
}
