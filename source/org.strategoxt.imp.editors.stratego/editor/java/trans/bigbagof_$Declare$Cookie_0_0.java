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

@SuppressWarnings("all") public class bigbagof_$Declare$Cookie_0_0 extends Strategy 
{ 
  public static bigbagof_$Declare$Cookie_0_0 instance = new bigbagof_$Declare$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigbagof_DeclareCookie_0_0");
    Fail22165:
    { 
      IStrategoTerm term12076 = term;
      Success11946:
      { 
        Fail22166:
        { 
          TermReference f_4320 = new TermReference();
          TermReference g_4320 = new TermReference();
          if(g_4320.value == null)
            g_4320.value = term;
          else
            if(g_4320.value != term && !g_4320.value.match(term))
              break Fail22166;
          if(f_4320.value == null)
            f_4320.value = term;
          else
            if(f_4320.value != term && !f_4320.value.match(term))
              break Fail22166;
          Success11947:
          { 
            Fail22167:
            { 
              IStrategoTerm k_4320 = null;
              k_4320 = term;
              term = dr_lookup_all_rules_0_2.instance.invoke(context, k_4320, trans.const4358, g_4320.value);
              if(term == null)
                break Fail22167;
              if(true)
                break Success11947;
            }
            term = trans.constNil3;
          }
          lifted6785 lifted67850 = new lifted6785();
          lifted67850.f_4320 = f_4320;
          lifted67850.g_4320 = g_4320;
          term = filter_1_0.instance.invoke(context, term, lifted67850);
          if(term == null)
            break Fail22166;
          if(true)
            break Success11946;
        }
        term = term12076;
        TermReference x_4319 = new TermReference();
        TermReference y_4319 = new TermReference();
        if(x_4319.value == null)
          x_4319.value = term;
        else
          if(x_4319.value != term && !x_4319.value.match(term))
            break Fail22165;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail22165;
        if(y_4319.value == null)
          y_4319.value = term.getSubterm(0);
        else
          if(y_4319.value != term.getSubterm(0) && !y_4319.value.match(term.getSubterm(0)))
            break Fail22165;
        Success11948:
        { 
          Fail22168:
          { 
            IStrategoTerm b_4320 = null;
            IStrategoTerm d_4320 = null;
            IStrategoTerm e_4320 = null;
            d_4320 = term;
            b_4320 = trans.const4358;
            term = d_4320;
            e_4320 = d_4320;
            if(y_4319.value == null)
              break Fail22168;
            term = termFactory.annotateTerm(termFactory.makeTuple(y_4319.value, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
            term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4320, b_4320, term);
            if(term == null)
              break Fail22168;
            if(true)
              break Success11948;
          }
          term = trans.constNil3;
        }
        lifted6786 lifted67860 = new lifted6786();
        lifted67860.y_4319 = y_4319;
        lifted67860.x_4319 = x_4319;
        term = filter_1_0.instance.invoke(context, term, lifted67860);
        if(term == null)
          break Fail22165;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}