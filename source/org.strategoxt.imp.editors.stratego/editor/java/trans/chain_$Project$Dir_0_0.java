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

@SuppressWarnings("all") public class chain_$Project$Dir_0_0 extends Strategy 
{ 
  public static chain_$Project$Dir_0_0 instance = new chain_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ProjectDir_0_0");
    Fail23390:
    { 
      IStrategoTerm j_4831 = null;
      IStrategoTerm l_4831 = null;
      l_4831 = term;
      Success12576:
      { 
        Fail23391:
        { 
          IStrategoTerm m_4831 = null;
          IStrategoTerm o_4831 = null;
          IStrategoTerm p_4831 = null;
          o_4831 = term;
          m_4831 = trans.const4475;
          p_4831 = o_4831;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4831, m_4831, trans.constCons2047);
          if(term == null)
            break Fail23391;
          if(true)
            break Success12576;
        }
        term = trans.constNil4;
      }
      j_4831 = term;
      term = l_4831;
      term = termFactory.makeTuple(j_4831, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6970.instance);
      if(term == null)
        break Fail23390;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}