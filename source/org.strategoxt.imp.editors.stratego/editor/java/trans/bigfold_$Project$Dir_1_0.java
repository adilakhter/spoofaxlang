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

@SuppressWarnings("all") public class bigfold_$Project$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Project$Dir_1_0 instance = new bigfold_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4276)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ProjectDir_1_0");
    Fail21908:
    { 
      IStrategoTerm j_4276 = null;
      IStrategoTerm l_4276 = null;
      l_4276 = term;
      Success11864:
      { 
        Fail21909:
        { 
          IStrategoTerm m_4276 = null;
          IStrategoTerm o_4276 = null;
          IStrategoTerm p_4276 = null;
          o_4276 = term;
          m_4276 = trans.const4265;
          p_4276 = o_4276;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4276, m_4276, trans.constCons1966);
          if(term == null)
            break Fail21909;
          if(true)
            break Success11864;
        }
        term = trans.constNil3;
      }
      j_4276 = term;
      term = l_4276;
      term = termFactory.makeTuple(j_4276, term);
      term = i_4276.invoke(context, term, lifted6696.instance);
      if(term == null)
        break Fail21908;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}