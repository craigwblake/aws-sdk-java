/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Crawler policy for update and deletion behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SchemaChangePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaChangePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The update behavior.
     * </p>
     */
    private String updateBehavior;
    /**
     * <p>
     * The deletion behavior.
     * </p>
     */
    private String deleteBehavior;

    /**
     * <p>
     * The update behavior.
     * </p>
     * 
     * @param updateBehavior
     *        The update behavior.
     * @see UpdateBehavior
     */

    public void setUpdateBehavior(String updateBehavior) {
        this.updateBehavior = updateBehavior;
    }

    /**
     * <p>
     * The update behavior.
     * </p>
     * 
     * @return The update behavior.
     * @see UpdateBehavior
     */

    public String getUpdateBehavior() {
        return this.updateBehavior;
    }

    /**
     * <p>
     * The update behavior.
     * </p>
     * 
     * @param updateBehavior
     *        The update behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateBehavior
     */

    public SchemaChangePolicy withUpdateBehavior(String updateBehavior) {
        setUpdateBehavior(updateBehavior);
        return this;
    }

    /**
     * <p>
     * The update behavior.
     * </p>
     * 
     * @param updateBehavior
     *        The update behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateBehavior
     */

    public SchemaChangePolicy withUpdateBehavior(UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The deletion behavior.
     * </p>
     * 
     * @param deleteBehavior
     *        The deletion behavior.
     * @see DeleteBehavior
     */

    public void setDeleteBehavior(String deleteBehavior) {
        this.deleteBehavior = deleteBehavior;
    }

    /**
     * <p>
     * The deletion behavior.
     * </p>
     * 
     * @return The deletion behavior.
     * @see DeleteBehavior
     */

    public String getDeleteBehavior() {
        return this.deleteBehavior;
    }

    /**
     * <p>
     * The deletion behavior.
     * </p>
     * 
     * @param deleteBehavior
     *        The deletion behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteBehavior
     */

    public SchemaChangePolicy withDeleteBehavior(String deleteBehavior) {
        setDeleteBehavior(deleteBehavior);
        return this;
    }

    /**
     * <p>
     * The deletion behavior.
     * </p>
     * 
     * @param deleteBehavior
     *        The deletion behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteBehavior
     */

    public SchemaChangePolicy withDeleteBehavior(DeleteBehavior deleteBehavior) {
        this.deleteBehavior = deleteBehavior.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUpdateBehavior() != null)
            sb.append("UpdateBehavior: ").append(getUpdateBehavior()).append(",");
        if (getDeleteBehavior() != null)
            sb.append("DeleteBehavior: ").append(getDeleteBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaChangePolicy == false)
            return false;
        SchemaChangePolicy other = (SchemaChangePolicy) obj;
        if (other.getUpdateBehavior() == null ^ this.getUpdateBehavior() == null)
            return false;
        if (other.getUpdateBehavior() != null && other.getUpdateBehavior().equals(this.getUpdateBehavior()) == false)
            return false;
        if (other.getDeleteBehavior() == null ^ this.getDeleteBehavior() == null)
            return false;
        if (other.getDeleteBehavior() != null && other.getDeleteBehavior().equals(this.getDeleteBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateBehavior() == null) ? 0 : getUpdateBehavior().hashCode());
        hashCode = prime * hashCode + ((getDeleteBehavior() == null) ? 0 : getDeleteBehavior().hashCode());
        return hashCode;
    }

    @Override
    public SchemaChangePolicy clone() {
        try {
            return (SchemaChangePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SchemaChangePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
