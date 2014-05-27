package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Multi$Arg$Option_3_0 extends Strategy 
{ 
  public static $Multi$Arg$Option_3_0 instance = new $Multi$Arg$Option_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4541, Strategy g_4541, Strategy h_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MultiArgOption_3_0");
    Fail25526:
    { 
      IStrategoTerm term10086 = term;
      Success10065:
      { 
        Fail25527:
        { 
          IStrategoTerm m_4229 = null;
          IStrategoTerm n_4229 = null;
          IStrategoTerm o_4229 = null;
          IStrategoTerm p_4229 = null;
          IStrategoTerm y_4229 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail25527;
          m_4229 = ((IStrategoList)term).head();
          n_4229 = ((IStrategoList)term).tail();
          y_4229 = term;
          term = f_4541.invoke(context, m_4229);
          if(term == null)
            break Fail25527;
          term = n_4229;
          IStrategoTerm term10087 = term;
          Success10066:
          { 
            Fail25528:
            { 
              IStrategoTerm i_4684 = null;
              IStrategoTerm j_4684 = null;
              IStrategoTerm k_4684 = null;
              term = split_fetch_keep_1_0.instance.invoke(context, term, lifted9076.instance);
              if(term == null)
                break Fail25528;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                break Fail25528;
              i_4684 = term.getSubterm(0);
              j_4684 = term.getSubterm(1);
              k_4684 = term.getSubterm(2);
              IStrategoList list375;
              list375 = checkListTail(k_4684);
              if(list375 == null)
                break Fail25528;
              term = termFactory.makeTuple(i_4684, (IStrategoTerm)termFactory.makeListCons(j_4684, list375));
              if(true)
                break Success10066;
            }
            term = term10087;
            term = termFactory.makeTuple(term, generator.constNil7);
          }
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25527;
          p_4229 = term.getSubterm(0);
          o_4229 = term.getSubterm(1);
          term = g_4541.invoke(context, p_4229);
          if(term == null)
            break Fail25527;
          term = y_4229;
          IStrategoList list376;
          list376 = checkListTail(o_4229);
          if(list376 == null)
            break Fail25527;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const6968, list376);
          if(true)
            break Success10065;
        }
        term = term10086;
        if(term.getTermType() != IStrategoTerm.STRING || !"register-usage-info".equals(((IStrategoString)term).stringValue()))
          break Fail25526;
        term = register_usage_1_0.instance.invoke(context, term, h_4541);
        if(term == null)
          break Fail25526;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}