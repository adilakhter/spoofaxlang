package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Current$File_0_1 extends Strategy 
{ 
  public static aux_$Current$File_0_1 instance = new aux_$Current$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_92080)
  { 
    Fail76137:
    { 
      IStrategoTerm z_92080 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76137;
      IStrategoTerm arg26196 = term.getSubterm(0);
      if(arg26196.getTermType() != IStrategoTerm.STRING || !"99705".equals(((IStrategoString)arg26196).stringValue()))
        break Fail76137;
      z_92080 = term.getSubterm(1);
      term = z_92080;
      if(true)
        return term;
    }
    context.push("aux_CurrentFile_0_1");
    context.popOnFailure();
    return null;
  }
}