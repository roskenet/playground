import React from 'react';
import { connect } from 'react-redux';
import ExpenseForm from './ExpenseForm';
import { editExpense, removeExpense } from '../actions/expenses';

export class EditExpensePage extends React.Component {

    render() {
        return (
            <div>
                <ExpenseForm
                    expense={this.props.expense}
                    onSubmit={(expense) => {
                        // Dispatch the action to edit the expense
                        // Redirect to the dashboard
                        this.props.dispatch(editExpense(this.props.expense.id, expense));
                        this.props.history.push('/');
                        console.log('updated', expense);
                    }}
                />
                <button 
                    onClick={(expense) => {
                        this.props.dispatch(removeExpense({ id: this.props.expense.id }));
                        this.props.history.push('/');
                        }
                    }
                >Remove me!</button>
            </div>
        );
    }
}

const mapStateToProps = (state, props) => {
    return {
        expense: state.expenses.find((expense) => expense.id === props.match.params.id)
    };
};

export default connect(mapStateToProps)(EditExpensePage);