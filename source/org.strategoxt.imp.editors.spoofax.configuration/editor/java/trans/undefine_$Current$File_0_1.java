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

@SuppressWarnings("all") public class undefine_$Current$File_0_1 extends Strategy 
{ 
  public static undefine_$Current$File_0_1 instance = new undefine_$Current$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_4638)
  { 
    Fail22977:
    { 
      if(true)
        break Fail22977;
      if(true)
        return term;
    }
    context.push("undefine_CurrentFile_0_1");
    context.popOnFailure();
    return null;
  }
}