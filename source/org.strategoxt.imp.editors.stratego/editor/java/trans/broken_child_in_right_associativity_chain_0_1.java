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

@SuppressWarnings("all") public class broken_child_in_right_associativity_chain_0_1 extends Strategy 
{ 
  public static broken_child_in_right_associativity_chain_0_1 instance = new broken_child_in_right_associativity_chain_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_4344)
  { 
    context.push("broken_child_in_right_associativity_chain_0_1");
    Fail21286:
    { 
      IStrategoTerm term11440 = term;
      Success11439:
      { 
        Fail21287:
        { 
          IStrategoTerm x_4169 = null;
          IStrategoTerm cons531 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(cons531 != w_4344 && !w_4344.match(cons531))
            break Fail21287;
          IStrategoTerm args15 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(args15.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args15).isEmpty())
            break Fail21287;
          IStrategoTerm arg7547 = ((IStrategoList)args15).tail();
          if(arg7547.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7547).isEmpty())
            break Fail21287;
          IStrategoTerm arg7548 = ((IStrategoList)arg7547).head();
          x_4169 = arg7548;
          IStrategoTerm cons532 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg7548});
          if(cons532 != w_4344 && !w_4344.match(cons532))
            break Fail21287;
          IStrategoTerm args16 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg7548});
          if(args16.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args16).isEmpty())
            break Fail21287;
          IStrategoTerm arg7549 = ((IStrategoList)args16).tail();
          if(arg7549.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7549).isEmpty())
            break Fail21287;
          IStrategoTerm arg7550 = ((IStrategoList)arg7549).tail();
          if(arg7550.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7550).isEmpty())
            break Fail21287;
          IStrategoTerm arg7551 = ((IStrategoList)arg7547).tail();
          if(arg7551.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7551).isEmpty())
            break Fail21287;
          term = this.invoke(context, x_4169, w_4344);
          if(term == null)
            break Fail21287;
          if(true)
            break Success11439;
        }
        term = term11440;
        IStrategoTerm s_4169 = null;
        IStrategoTerm cons533 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(cons533 != w_4344 && !w_4344.match(cons533))
          break Fail21286;
        IStrategoTerm args17 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(args17.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args17).isEmpty())
          break Fail21286;
        IStrategoTerm arg7552 = ((IStrategoList)args17).tail();
        if(arg7552.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7552).isEmpty())
          break Fail21286;
        IStrategoTerm arg7553 = ((IStrategoList)arg7552).head();
        IStrategoTerm cons534 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg7553});
        if(cons534 != w_4344 && !w_4344.match(cons534))
          break Fail21286;
        IStrategoTerm args18 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg7553});
        if(args18.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args18).isEmpty())
          break Fail21286;
        IStrategoTerm arg7554 = ((IStrategoList)args18).tail();
        if(arg7554.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7554).isEmpty())
          break Fail21286;
        s_4169 = ((IStrategoList)arg7554).head();
        IStrategoTerm arg7555 = ((IStrategoList)arg7554).tail();
        if(arg7555.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7555).isEmpty())
          break Fail21286;
        IStrategoTerm arg7556 = ((IStrategoList)arg7552).tail();
        if(arg7556.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7556).isEmpty())
          break Fail21286;
        term = s_4169;
        IStrategoTerm term11441 = term;
        Success11440:
        { 
          Fail21288:
          { 
            term = in_selected_fragment_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21288;
            { 
              if(true)
                break Fail21286;
              if(true)
                break Success11440;
            }
          }
          term = term11441;
        }
        term = s_4169;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}