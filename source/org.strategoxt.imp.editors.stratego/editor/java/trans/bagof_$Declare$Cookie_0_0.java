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

@SuppressWarnings("all") public class bagof_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static bagof_$Declare$Cookie_0_0 instance = new bagof_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bagof_DeclareCookie_0_0");
    Fail22175:
    { 
      IStrategoTerm term12083 = term;
      Success11953:
      { 
        Fail22176:
        { 
          TermReference f_4322 = new TermReference();
          TermReference g_4322 = new TermReference();
          if(g_4322.value == null)
            g_4322.value = term;
          else
            if(g_4322.value != term && !g_4322.value.match(term))
              break Fail22176;
          if(f_4322.value == null)
            f_4322.value = term;
          else
            if(f_4322.value != term && !f_4322.value.match(term))
              break Fail22176;
          Success11954:
          { 
            Fail22177:
            { 
              IStrategoTerm k_4322 = null;
              k_4322 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, k_4322, trans.const4358, g_4322.value);
              if(term == null)
                break Fail22177;
              if(true)
                break Success11954;
            }
            term = trans.constNil3;
          }
          lifted6791 lifted67910 = new lifted6791();
          lifted67910.f_4322 = f_4322;
          lifted67910.g_4322 = g_4322;
          term = filter_1_0.instance.invoke(context, term, lifted67910);
          if(term == null)
            break Fail22176;
          if(true)
            break Success11953;
        }
        term = term12083;
        TermReference x_4321 = new TermReference();
        TermReference y_4321 = new TermReference();
        if(x_4321.value == null)
          x_4321.value = term;
        else
          if(x_4321.value != term && !x_4321.value.match(term))
            break Fail22175;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22175;
        if(y_4321.value == null)
          y_4321.value = term.getSubterm(0);
        else
          if(y_4321.value != term.getSubterm(0) && !y_4321.value.match(term.getSubterm(0)))
            break Fail22175;
        Success11955:
        { 
          Fail22178:
          { 
            IStrategoTerm b_4322 = null;
            IStrategoTerm d_4322 = null;
            IStrategoTerm e_4322 = null;
            d_4322 = term;
            b_4322 = trans.const4358;
            term = d_4322;
            e_4322 = d_4322;
            if(y_4321.value == null)
              break Fail22178;
            term = termFactory.annotateTerm(termFactory.makeTuple(y_4321.value, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_rule_0_2.instance.invoke(context, e_4322, b_4322, term);
            if(term == null)
              break Fail22178;
            if(true)
              break Success11955;
          }
          term = trans.constNil3;
        }
        lifted6792 lifted67920 = new lifted6792();
        lifted67920.y_4321 = y_4321;
        lifted67920.x_4321 = x_4321;
        term = filter_1_0.instance.invoke(context, term, lifted67920);
        if(term == null)
          break Fail22175;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}