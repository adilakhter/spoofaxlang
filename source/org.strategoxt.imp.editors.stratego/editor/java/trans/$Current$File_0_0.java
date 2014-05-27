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

@SuppressWarnings("all") public class $Current$File_0_0 extends Strategy 
{ 
  public static $Current$File_0_0 instance = new $Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentFile_0_0");
    Fail23425:
    { 
      TermReference g_4837 = new TermReference();
      IStrategoTerm j_4837 = null;
      IStrategoTerm l_4837 = null;
      IStrategoTerm m_4837 = null;
      if(g_4837.value == null)
        g_4837.value = term;
      else
        if(g_4837.value != term && !g_4837.value.match(term))
          break Fail23425;
      l_4837 = term;
      j_4837 = trans.const4473;
      m_4837 = l_4837;
      term = dr_lookup_rule_0_2.instance.invoke(context, m_4837, j_4837, trans.constCons2047);
      if(term == null)
        break Fail23425;
      lifted6984 lifted69840 = new lifted6984();
      lifted69840.g_4837 = g_4837;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted69840);
      if(term == null)
        break Fail23425;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}