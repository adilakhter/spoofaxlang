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

@SuppressWarnings("all") public class fold_$Current$Dir_1_0 extends Strategy 
{ 
  public static fold_$Current$Dir_1_0 instance = new fold_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4861)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentDir_1_0");
    Fail23568:
    { 
      IStrategoTerm g_4861 = null;
      IStrategoTerm i_4861 = null;
      i_4861 = term;
      Success12623:
      { 
        Fail23569:
        { 
          IStrategoTerm j_4861 = null;
          IStrategoTerm l_4861 = null;
          IStrategoTerm m_4861 = null;
          l_4861 = term;
          j_4861 = trans.const4556;
          m_4861 = l_4861;
          term = dr_lookup_rule_0_2.instance.invoke(context, m_4861, j_4861, trans.constCons2047);
          if(term == null)
            break Fail23569;
          if(true)
            break Success12623;
        }
        term = trans.constNil4;
      }
      g_4861 = term;
      term = i_4861;
      term = termFactory.makeTuple(g_4861, term);
      term = f_4861.invoke(context, term, lifted7031.instance);
      if(term == null)
        break Fail23568;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}