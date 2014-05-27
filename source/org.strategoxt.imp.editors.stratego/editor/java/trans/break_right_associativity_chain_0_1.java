package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class break_right_associativity_chain_0_1 extends Strategy 
{ 
  public static break_right_associativity_chain_0_1 instance = new break_right_associativity_chain_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_4344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("break_right_associativity_chain_0_1");
    Fail21283:
    { 
      IStrategoTerm term11438 = term;
      Success11437:
      { 
        Fail21284:
        { 
          IStrategoTerm i_4169 = null;
          IStrategoTerm j_4169 = null;
          IStrategoTerm m_4169 = null;
          IStrategoTerm n_4169 = null;
          IStrategoTerm cons527 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(cons527 != v_4344 && !v_4344.match(cons527))
            break Fail21284;
          IStrategoTerm args11 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(args11.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args11).isEmpty())
            break Fail21284;
          i_4169 = ((IStrategoList)args11).head();
          IStrategoTerm arg7537 = ((IStrategoList)args11).tail();
          if(arg7537.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7537).isEmpty())
            break Fail21284;
          IStrategoTerm arg7538 = ((IStrategoList)arg7537).head();
          j_4169 = arg7538;
          IStrategoTerm cons528 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg7538});
          if(cons528 != v_4344 && !v_4344.match(cons528))
            break Fail21284;
          IStrategoTerm args12 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg7538});
          if(args12.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args12).isEmpty())
            break Fail21284;
          IStrategoTerm arg7539 = ((IStrategoList)args12).tail();
          if(arg7539.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7539).isEmpty())
            break Fail21284;
          IStrategoTerm arg7540 = ((IStrategoList)arg7539).tail();
          if(arg7540.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7540).isEmpty())
            break Fail21284;
          IStrategoTerm arg7541 = ((IStrategoList)arg7537).tail();
          if(arg7541.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7541).isEmpty())
            break Fail21284;
          n_4169 = term;
          term = this.invoke(context, j_4169, v_4344);
          if(term == null)
            break Fail21284;
          m_4169 = term;
          term = n_4169;
          IStrategoTerm mkterm5;
          mkterm5 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{v_4344, (IStrategoTerm)termFactory.makeListCons(i_4169, termFactory.makeListCons(m_4169, (IStrategoList)trans.constNil3))});
          if(mkterm5 == null)
            break Fail21284;
          term = mkterm5;
          if(true)
            break Success11437;
        }
        term = term11438;
        IStrategoTerm c_4169 = null;
        IStrategoTerm d_4169 = null;
        IStrategoTerm e_4169 = null;
        IStrategoTerm f_4169 = null;
        IStrategoTerm cons529 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(cons529 != v_4344 && !v_4344.match(cons529))
          break Fail21283;
        IStrategoTerm args13 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(args13.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args13).isEmpty())
          break Fail21283;
        c_4169 = ((IStrategoList)args13).head();
        IStrategoTerm arg7542 = ((IStrategoList)args13).tail();
        if(arg7542.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7542).isEmpty())
          break Fail21283;
        IStrategoTerm arg7543 = ((IStrategoList)arg7542).head();
        IStrategoTerm cons530 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg7543});
        if(cons530 != v_4344 && !v_4344.match(cons530))
          break Fail21283;
        IStrategoTerm args14 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg7543});
        if(args14.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args14).isEmpty())
          break Fail21283;
        d_4169 = ((IStrategoList)args14).head();
        IStrategoTerm arg7544 = ((IStrategoList)args14).tail();
        if(arg7544.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7544).isEmpty())
          break Fail21283;
        e_4169 = ((IStrategoList)arg7544).head();
        IStrategoTerm arg7545 = ((IStrategoList)arg7544).tail();
        if(arg7545.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7545).isEmpty())
          break Fail21283;
        IStrategoTerm arg7546 = ((IStrategoList)arg7542).tail();
        if(arg7546.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7546).isEmpty())
          break Fail21283;
        f_4169 = term;
        term = e_4169;
        IStrategoTerm term11439 = term;
        Success11438:
        { 
          Fail21285:
          { 
            term = in_selected_fragment_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21285;
            { 
              if(true)
                break Fail21283;
              if(true)
                break Success11438;
            }
          }
          term = term11439;
        }
        term = f_4169;
        IStrategoTerm mkterm6;
        mkterm6 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{v_4344, (IStrategoTerm)termFactory.makeListCons(c_4169, termFactory.makeListCons(d_4169, (IStrategoList)trans.constNil3))});
        if(mkterm6 == null)
          break Fail21283;
        term = mkterm6;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}