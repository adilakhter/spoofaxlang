package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Current$File_0_1 extends Strategy 
{ 
  public static aux_$Current$File_0_1 instance = new aux_$Current$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4642)
  { 
    Fail23001:
    { 
      IStrategoTerm c_4642 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23001;
      IStrategoTerm arg8050 = term.getSubterm(0);
      if(arg8050.getTermType() != IStrategoTerm.STRING || !"99705".equals(((IStrategoString)arg8050).stringValue()))
        break Fail23001;
      c_4642 = term.getSubterm(1);
      term = c_4642;
      if(true)
        return term;
    }
    context.push("aux_CurrentFile_0_1");
    context.popOnFailure();
    return null;
  }
}